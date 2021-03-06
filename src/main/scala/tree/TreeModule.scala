package tree

object TreeModule {
  sealed trait Tree[+T]

  case class Branch[T](left: Tree[T],value: T,right: Tree[T]) extends Tree[T]
  case class Leaf[T](value: T) extends Tree[T]
  case object Empty extends Tree[Nothing]
}
