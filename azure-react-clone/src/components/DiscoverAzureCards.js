import React from "react"
import "./DiscoverAzureCards.css"

function DiscoverAzureCards({ img, title, text }) {
  return (
    <>
      <div className="discover-cards">
        <div className="discover-cards-container">
          <img src={img} />
          <div className="discover-cards-content">
            <h3>{title}</h3>
            <p>{text}</p>
            <div className="discover-learn-more-btn">
              <a>
                <span>Learn more</span>
                <span className="arrow"></span>
              </a>
            </div>
          </div>
          <div className="discover-blank"></div>
        </div>
      </div>
    </>
  )
}

export default DiscoverAzureCards


