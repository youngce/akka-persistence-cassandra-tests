import akka.actor.Props
import akka.persistence.PersistentActor

object Counter{
  def props()=Props(new Counter())

  case class Add(amount:Int)
  case class Added(amount:Int)
}

class Counter extends PersistentActor{
  var total=0
  import Counter._
  override def receiveRecover: Receive = {
    case Added(amount)=>updateTotal(amount)
  }

  def updateTotal(amount:Int)={
    total+=amount
  }
  override def receiveCommand: Receive = {
    case Add(amount)=>
      persist(Added(amount))(evt=>updateTotal(evt.amount))
  }

  override def persistenceId: String = self.path.name
}
