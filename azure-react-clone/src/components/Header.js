import React from "react"
import hamburger from "../assets/img/hamburger.svg"
import azurelogo from "../assets/img/azure-logo.svg"
import searchlogo from "../assets/img/search.svg"
import downArrow from "../assets/img/arrow.svg"
import moreIcon from "../assets/img/more.svg"

import "./Header.css"

function Header() {
  return (
    <>
      <div className="azure-header">
        <div className="azure-mobile-header">
          <div className="azure-hamburger">
            <div className="hamburger">
              <img src={hamburger} />
            </div>
            <div className="azure-text">
              <a href="#">Azure</a>
            </div>
          </div>
          <div className="azure-logo-mobile">
            <img src={azurelogo} />
          </div>
          <div className="search-sign-in">
            <div className="search-logo">
              <img src={searchlogo} />
            </div>
            <div className="sign-in">
              <a href="#">Sign In</a>
            </div>
          </div>
        </div>

        <div className="azure-tablet-header">
          <nav className="nav-tablet-header">
            <div className="logo-azure-tablet">
              <div className="azure-logo-tablet">
                <img src={azurelogo} />
              </div>
              <div className="azure-text-tablet">
                <a href="#">Azure</a>
              </div>
            </div>
            <ul>
              <li>
                <button className="nav-buttons">
                  <a href="#">Explore</a>
                  <img src={downArrow} />
                </button>
              </li>
              <li>
                <button className="nav-buttons">
                  <a href="#">Products</a>
                  <img src={downArrow} />
                </button>
              </li>
              <li>
                <button className="nav-buttons">
                  <a href="#">Solutions</a>
                  <img src={downArrow} />
                </button>
              </li>
              <li>
                <button className="nav-buttons">
                  <a href="#">Pricing</a>
                  <img src={downArrow} />
                </button>
              </li>
              <li>
                <button className="nav-buttons">
                  <a href="#">Partners</a>
                  <img src={downArrow} />
                </button>
              </li>
              <li>
                <button className="nav-buttons">
                  <a href="#">Resources</a>
                  <img src={downArrow} />
                </button>
              </li>
            </ul>
          </nav>
          <div className="tablet-search">
            <img src={searchlogo} />
          </div>
          <div className="sign-in-more">
            <div className="more-icon">
              <img src={moreIcon} />
            </div>
            <div className="sign-in-tablet">
              <a href="#">Sign In</a>
            </div>
          </div>
          <form className="azure-desktop-search">
            <div className="azure-search-container">
              <input type="text" placeholder="Search"></input>
              <button className="search-btn-desktop">
                <img src={searchlogo} />
              </button>
            </div>
          </form>

          <nav className="azure-desktop-support">
            <ul>
              <li>Learn</li>
              <li>Support</li>
              <li>Contact Sales</li>
              <li>
              <a href="#" className="free-acount-green-btn">Free account</a>
              </li>
              <li>Sign In</li>
            </ul>
          </nav>
        </div>
      </div>
    </>
  )
}

export default Header
