import java.io.DataOutputStream
import java.net.ServerSocket

fun main(){
    //서버 역할용 객체 생성
    val server = ServerSocket(8080)
    println("사용자 접속 대기")
    val socket = server.accept()
    println(socket)

    //클라이언트로 데이터 보내기
    val outPutString = socket.getOutputStream()
    val dos = DataOutputStream(outPutString)

    dos.writeInt(100)
    dos.writeDouble(11.11)
    dos.writeBoolean(true)
    dos.writeUTF("서버가 보낸 문자열")

    //서버 종료
    socket.close()
}