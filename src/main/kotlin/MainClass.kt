import java.net.ServerSocket

fun main(){
    //서버 역할용 객체 생성
    val server = ServerSocket(8080)
    println("사용자 접속 대기")
    val socket = server.accept()
    println(socket)

    //서버 종료
    socket.close()
}