import React, {useState, useEffect} from "react"
import "./OfferNav.css"

function OfferNav() {
  const [offerNavData, setOfferNavData] = useState([])

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
    .then((response) => {
        return response.json()
    })
    .then((data) => {
        setOfferNavData(data.navOfferSales)
    })
  }

    useEffect(() => {
        fetchData()
    }, [])


  return (
    <>
      <div className="offer-nav">
        {offerNavData.map((item) => {
            return (
            <div className="offer-nav-img" key={item}>
              <img src={item} />
            </div>
            )
        })}

        </div>
    </>
  )
}

export default OfferNav
