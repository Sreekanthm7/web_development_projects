import React, { useEffect, useState } from "react"
import "./FashionNav.css"

function FashionNav() {
  const [fashionData, setFashionData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
    .then((response) => {
        return response.json()
    })
    .then((data) => {
        setFashionData(data.fashionNavMobile)
    })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="fashion-nav">
        {fashionData.map((item) => {
            return(
        <div className="fashion-nav-img" key={item}> 
          <img src={item} />
          
        </div>
            )
        })}
        
      </div>
    </>
  )
}

export default FashionNav
