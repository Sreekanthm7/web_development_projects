import React from "react"
import "./DataMainCard.css"

function DataMainCard({ img, text }) {
  return (
    <>
      <div className="data-main-card-img">
        <img src={img} />
      </div>
      <div className="data-main-card-content">
        <h2>{text}</h2>
        <span className="view-all-btn-card">VIEW ALL</span>
      </div>
    </>
  )
}

export default DataMainCard
