import React, { useState, useEffect } from "react"
import "./AccelarationMigration.css"

function AccelarationMigration() {
  const [data, setData] = useState({})

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/azure-json-data/data.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setData(data.accelarationMigration)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="accelaration-migration">
        <div className="accelaration-migration-container">
          <div className="accelaraton-migration-img">
            <img src={data.image} />
          </div>
          <div className="accelaration-migration-content">
            <h2>{data.text}</h2>
            <div className="explore-btn">
              <a>Explore help and tools</a>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default AccelarationMigration
