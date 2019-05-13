import com.ssk.chapter27.{SimpleBrowser, SimpleDatabase}

val apple = SimpleDatabase.foodNamed("Apple").get
println(apple)
SimpleBrowser.recipeUsing(apple)

def displayCategory(category: SimpleDatabase.FoodCategory) {
	println(category)
}