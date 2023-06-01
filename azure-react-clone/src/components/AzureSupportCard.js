import React from "react"
import "./AzureSupportCard.css"

function AzureSupportCard({ bg, img, title, text }) {
  return (
    <>
      <div className="azure-support-card" >
        <div className="azure-support-card-container" style={{ backgroundColor: bg}}>
            <div className="support-card-img">
                <img src={img}/>
            </div>
            <div className="support-card-content">
            
            <h2>{title}</h2>
            
            <p>{text}</p>

            </div>
            <div className="support-blank">

            </div>
        </div>
      </div>
    </>
  )
}

export default AzureSupportCard
