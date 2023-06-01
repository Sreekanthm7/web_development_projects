import React from "react"
import "./AzureCustomerCards.css"

function AzureCustomerCards({ img, text }) {
  return (
    <>
      <div className="azure-customer-cards">
        <div className="customer-cards-img">
          <img src={img} />
        </div>
        <div className="customer-card-text">
          <div className="customer-card-text-container">
            <h3>{text}</h3>
            <div className="case-study">
            <a>
                <span>Case study</span>
                <span className="arrow"></span>
            </a>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default AzureCustomerCards

