import React, { useState, useEffect } from "react"
import "./SalesIsLive.css"

function SalesIsLive() {
  const [salesIsLiveData, setSalesLiveData] = useState({})
  const [salesCardData, setSalesCardData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setSalesLiveData(data.saleIsLive)
        setSalesCardData(data.salesLiveCards)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="sales-is-live-container">
        <div className="sales-is-live-top-img">
          <img src={salesIsLiveData} />
        </div>
        <div className="sales-live-cards-container">
          {salesCardData.map((item) => {
            return (
              <div className="sales-is-live-card-img" key={item}>
                <img src={item} />
              </div>
            )
          })}
        </div>
      </div>
    </>
  )
}

export default SalesIsLive
