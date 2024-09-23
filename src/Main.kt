fun main() {

    var pointOne = Point(10,20)
    var pointTwo = Point(12,34)

    println(pointOne isAbove pointTwo)
    println(pointOne isRightOf pointTwo)

}

data class Point(var x: Int , var y: Int){

    infix fun isAbove(point: Point): String{
        if (this.y > point.y){
            val result = this.y - point.y
            return "Точка 1 выше точки 2 на $result"
        } else {
            val result = point.y - this.y
            return "Точка 1 выше точки 2 на $result"
        }

    }

    infix fun isRightOf(point: Point): String{
        if (this.x > point.x){
            val result = this.x - point.x
            return "Точка 1 правее точки 2 на $result"
        } else {
            val result = point.x - this.x
            return "Точка 2 правее точки 1 на $result"
        }

    }
}