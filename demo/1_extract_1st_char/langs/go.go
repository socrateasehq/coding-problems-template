package main
import "fmt"

func extractFirstChar(strFirstChar string) string {
	return strFirstChar[0:1]
}

func main(){
    // Taking input from user
	var strFirstChar string
	fmt.Scanln(&strFirstChar)
	fmt.Println(extractFirstChar(strFirstChar))
}
