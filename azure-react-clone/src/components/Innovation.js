import React, { useEffect, useState } from "react"
import "./Innovation.css"

function Innovation() {
  const [data, setData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/azure-json-data/data.json"
    )
      .then((responce) => {
        return responce.json()
      })
      .then((data) => {
        setData(data.innovation)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])


  return (
    <>
        <div className="azure-innovation-mobile">
          <div className="innovation-background-img-mobile">
            <img src={data.backgroundImg} />
          </div>
          <div className="innovation-content-container">
            <div className="innovation-content-body">
              <div className="innovation-content">
                <h1>{data.title}</h1>
                <div className="innovation-content-text-container">
                  <h1>{data.heading}</h1>
                  <p>{data.text}</p>
                </div>
                <div className="innovation-buttons">
                  <a href="#" className="get-started-btn">
                    <span>Get started</span>
                  </a>
                  <a href="#" className="try-azure-btn">
                    <span>Try Azure for free</span>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
    </>
  )
}

export default Innovation
