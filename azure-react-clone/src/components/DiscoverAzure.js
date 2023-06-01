import React, { useState, useEffect } from "react"
import "./DiscoverAzure.css"
import DiscoverAzureCards from "./DiscoverAzureCards"

function DiscoverAzure() {
  const [discoverData, setDiscoverData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/azure-json-data/data.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setDiscoverData(data.discoverAzure)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="discover-azure">
        <div className="discover-azure-container">
          <div className="discover-azure-heading">
            <h2>Discover what's happening on Azure</h2>
          </div>
          <div className="discover-azure-card-container">
            {discoverData.map((item) => {
              return (
                <DiscoverAzureCards
                  img={item.image}
                  title={item.title}
                  text={item.text}
                  key={item.text}
                />
              )
            })}
          </div>
        </div>
      </div>
    </>
  )
}

export default DiscoverAzure
