import React, { useState, useEffect } from "react"
import "./DesktopNav.css"
import blackArrow from '../../../assets/img/blackarrow.svg'

function DesktopNav() {
  const [desktopNavData, setDesktopNavData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setDesktopNavData(data.flipkartDesktopNav)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  return (
    <>
      <div className="desktop-nav">
        <div className="desktop-nav-container">
          {desktopNavData.map((item) => {
            return (
              <div className="desktop-nav-cards" key={item.img}>
                <div className="desktop-nav-img">
                  <img src={item.img}/>
    
                </div>
                <div className="nav-title">
                  <p>{item.text}</p>
                </div>
              </div>
            )
          })}
        </div>
      </div>
    </>
  )
}

export default DesktopNav
