import java.io.DataInputStream
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

    //클라이언트의 데이터 수신
    val inputString = socket.getInputStream()
    val dis = DataInputStream(inputString)
    val a1 = dis.readInt()
    val a2 = dis.readDouble()
    val a3 = dis.readBoolean()
    val a4= dis.readUTF()

    println("a1 : $a1\n")
    println("a2 : $a2\n")
    println("a3 : $a3\n")
    println("a4 : $a4\n")

    //서버 종료
    socket.close()
}