package japgolly.scalajs.react

package object internal {
  @inline implicit def toProfunctorOps[F[_, _], A, B](f: F[A, B])(implicit p: Profunctor[F]) =
    new Profunctor.Ops(f)(p)
}
