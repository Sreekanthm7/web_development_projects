import React, { useState, useEffect } from "react"
import "./GraborGone.css"
import GrabOrGoneCards from "./GrabOrGoneCards"

function GraborGone() {
  const [grabOrGoneData, setGrabOrGoneData] = useState({})
  const [grabOrGoneCardData, setGrabOrGoneCardData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    ).then((response) => {
      return response.json()
    })
    .then((data) => {
     setGrabOrGoneData(data.grabOrGone);
     setGrabOrGoneCardData(data.grabGoneCards)
    })
  }

  useEffect(() => {
    fetchData()
  }, [])



  return (
    <>
      <div className="grab-or-gone-container">
        <div className="grab-or-gone-container-head">
          <div className="grab-or-gone-head-img">
            <img src={grabOrGoneData.img} />
          </div>
          <div className="grab-or-gone-head-content">
            <p>{grabOrGoneData.text}</p>
            <div className="view-all-btn">
              <p>View all</p>
            </div>
          </div>
        </div>
        <div className="grab-or-gone-card-container">
          <div className="grab-or-gone-card-container-box">
            {grabOrGoneCardData.map((item) => {
              return(
              <GrabOrGoneCards img={item.img} text={item.text} link={item.link} key={item.img} />
              )
            })}
          </div>
        </div>
      </div>
    </>
  )
}

export default GraborGone
