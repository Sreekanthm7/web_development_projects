import React, { useState, useEffect } from "react"
import AzureProducts from "./AzureProducts"
import HybridData from "./HybridData"
import Innovation from "./Innovation"
import "./MainBody.css"
import downArrow from "../assets/img/arrow.svg"
import AzureCustomers from "./AzureCustomers"
import AccelarationMigration from "./AccelarationMigration"
import DiscoverAzure from "./DiscoverAzure"
import DeveloperStories from "./DeveloperStories"
import AzureServicesCards from "./AzureServicesCards"
import AzureSupport from "./AzureSupport"
import azurelogo from "../assets/img/azure-logo.svg"

function MainBody() {
  const [data, setData] = useState([])
  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/azure-json-data/data.json"
    )
      .then((responce) => {
        return responce.json()
      })
      .then((data) => {
        setData(data.hybridData)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])
  return (
    <div>

      <Innovation />
      <div className="on-premise-hybrid">
        <div className="on-premise-hybrid-container">
          <h2>
            On-premises, hybrid, multicloud, or at the edge—create secure,
            future-ready cloud solutions on Azure
          </h2>
        </div>
      </div>
      <div className="hybrid-data-container">
        <div className="hybrid-data">
          {data.map((item, index) => (
            <HybridData
              img={item.backgroundImg}
              title={item.title}
              text={item.text}
              key={index}
            />
          ))}
        </div>
      </div>
      <div className="new-to-azure">
        <div className="new-to-azure-container">
          <p>New to Azure?</p>
          <a href="#">Get an overview</a>
        </div>
      </div>
      <div className="products-service-heading">
        <div className="products-service-heading-container">
          <h2>
            Start putting your ideas into action with Azure products and
            services
          </h2>
        </div>
      </div>
      <div className="blank-container"></div>
      <AzureProducts />
      <div className="see-all-products-container">
        <a>
          <span>See all products(200+)</span>
          <span className="arrow"></span>
        </a>
      </div>
      <div className="customer-innovating">
        <div className="customer-innovation-container">
          <h2>Find out how these customers are innovating with Azure</h2>
        </div>
      </div>
      <AzureCustomers />
      <AccelarationMigration />
      <DiscoverAzure />
      <DeveloperStories />
      <AzureSupport />
    </div>
  )
}

export default MainBody
