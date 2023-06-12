import React from "react"
import "./HeaderDesktop.css"
import searchBtn from "../../../assets/img/search.svg"
import downArrow from "../../../assets/img/downarrow.svg"
import carticon from "../../../assets/img/carticon.svg"

function HeaderDesktop() {
  return (
    <>

      <div className="desktop-header">
      <div className="black-class"></div>
        <div className="desktop-header-container">
          <div className="desktop-flipkart-icon">
            <img src="https://static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png" />
            <a className="explore-plus">
              <span className="explore">Explore</span>
              <span className="plus">Plus</span>
              <img src="https://static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/plus_aef861.png" />
            </a>
          </div>
          <div className="desktop-search-container">
            <form className="search">
              <div className="desktop-search-bar">
                <input
                  type="text"
                  placeholder="Search for products, brands and more"
                ></input>
                <button className="desktop-search-btn">
                  <img src={searchBtn} />
                </button>
              </div>
            </form>
          </div>
          <div className="desktop-header-login">
            <a>Login</a>
          </div>
          <div className="become-seller">
            <a>Become a Seller</a>
          </div>
          <div className="more-btn">
            <a>More</a>
            <img src={downArrow} />
          </div>
          <div className="desktop-cart">
            <img src={carticon} />
            <p>Cart</p>
          </div>
        </div>
      </div>
    </>
  )
}

export default HeaderDesktop
