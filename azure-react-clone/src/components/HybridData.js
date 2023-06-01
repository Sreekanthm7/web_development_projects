import React, { useState, useEffect } from "react"
import "./HybridData.css"

function HybridData({ img, text, title }) {
  return (
    <>
      <div className="hybrid-cards-container">
        <div className="hybrid-cards">
          <img src={img} />
          <div className="hybrid-content">
            <h3>{title}</h3>
            <p>{text}</p>
          </div>
          <div className="blank"></div>
        </div>
      </div>
    </>
  )
}

export default HybridData