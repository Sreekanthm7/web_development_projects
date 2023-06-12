import React, { useState, useEffect } from "react"
import "./SeasonSaleEnd.css"

function SeasonSaleEnd() {
  const [seasonSaleEndData, setSeasonSaleEndData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setSeasonSaleEndData(data.seasonEndSaleMobile)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="season-end-sale">
        <div className="season-end-sale-head">
          <h3>End of Season Sale</h3>
          <p>Sponsored</p>
        </div>
        <div className="season-end-sale-cards">
          {seasonSaleEndData.map((item) => {
            return <img src={item} className="season-end-sale-img" key={item}/>
          })}
        </div>
      </div>
    </>
  )
}

export default SeasonSaleEnd
