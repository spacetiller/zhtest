package main
import (
    "encoding/json"
    "fmt"
)

// Product 商品信息
type Product struct {
    Name      string `json:"name"`
    ProductID int64 `json:"product_id,omitempty,string"`  // no blank before omitempty
    Number    int `json:"number,string"`
    Price     float64 `json:"price"`
    IsOnSale  bool `json:"is_on_sale"`
}

func main() {
    p := &Product{}
    p.Name = "Xiao mi 6"
    p.IsOnSale = true
    p.Number = 10000
    p.Price = 2499.00
    p.ProductID = 10
    data, _ := json.Marshal(p)
    fmt.Println("String(json) result:")
    fmt.Println(string(data))
}
