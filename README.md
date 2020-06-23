# Recreate HTTP2 Issue

paul@PCBLaptop:~$ curl http://0.0.0.0:8080/
OK
paul@PCBLaptop:~$ curl --http2 http://0.0.0.0:8080/
Error
