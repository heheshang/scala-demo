val capitals = Map("France" → "Paris",
	"Japan" → "Tokyo"
)

capitals.get("France")

def show(x: Option[String]) = x match {
	case Some(x) ⇒ x
	case None ⇒ "?"
}