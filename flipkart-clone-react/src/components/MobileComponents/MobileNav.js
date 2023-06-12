import React, { useState, useEffect } from "react"
import "./MobileNav.css"

function MobileNav() {
  const [navData, setNavData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
    .then((response) => {
        return response.json()
    })
    .then((data) => {
        setNavData(data.flipkartNavMobile)
    })
  }

  useEffect(() => {
    fetchData()
  }, [])


  return (
    <>
      <div className="nav-bar-container">

        {navData.map((item) => {
            return (
                <img src={item} key={item}/>
            )
        })}

      </div>
    </>
  )
}

export default MobileNav
