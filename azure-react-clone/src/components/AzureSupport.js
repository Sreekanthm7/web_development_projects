import React, { useState, useEffect } from "react"
import "./AzureSupport.css"
import AzureSupportCard from "./AzureSupportCard"

function AzureSupport() {
  const [supportData, setSupportData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/azure-json-data/data.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setSupportData(data.azureSupport)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="azure-support">
        <div className="azure-support-container">
          {supportData.map((item, index) => {
            return (
              <AzureSupportCard
                bg={item.bg}
                img={item.image}
                title={item.title}
                text={item.text}
                key={index}
              />
            )
          })}
        </div>
      </div>
    </>
  )
}

export default AzureSupport
