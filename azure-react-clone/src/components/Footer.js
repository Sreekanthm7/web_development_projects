import React from "react"
import "./Footer.css"
import footerLogo from "../assets/img/footerlogo.svg"
import instalogo from "../assets/img/instagram.svg"
import linkedIn from "../assets/img/linkedin.svg"
import twitter from "../assets/img/twitter.svg"

function Footer() {
  return (
    <>
      <div className="azure-footer">
        <div className="social-media">
          <a className="get-azure-mobile-app">
            <img src={footerLogo} />
            <span>Get the Azure mobile app</span>
          </a>
          <ul className="social-media-list">
            <li>
              <img src={twitter} />
            </li>
            <li>
              <img src={instalogo} />
            </li>
            <li>
              <img src={linkedIn} />
            </li>
          </ul>
        </div>
        <div className="footer-contents-mobile">
          <ul>
            <li>
              <p>Explore Azure</p>
              <span className="plus-btn"></span>
            </li>
            <li>
              <p>Products and pricing</p>
              <span className="plus-btn"></span>
            </li>
            <li>
              <p>Solutions and support</p>
              <span className="plus-btn"></span>
            </li>
            <li>
              <p>Partners</p>
              <span className="plus-btn"></span>
            </li>
            <li>
              <p>Resources</p>
              <span className="plus-btn"></span>
            </li>
            <li>
              <p>Cloud computing</p>
              <span className="plus-btn"></span>
            </li>
          </ul>
        </div>
        <div className="footer-content-desktop">
          <div className="footer-content-desktop-list">
            <h3>Explore Azure</h3>
            <ul>
              <li>What is Azure?</li>
              <li>Get started</li>
              <li>Global infrastructure</li>
              <li>Datacentre regions</li>
              <li>Trust your cloud</li>
              <li>Customer enablement</li>
              <li>Customer stories</li>
            </ul>
          </div>
          <div className="footer-content-desktop-list">
            <h3>Products and pricing</h3>
            <ul>
              <li>Products</li>
              <li>Pricing</li>
              <li>Free Azure services</li>
              <li>Flexible purchase options</li>
              <li>Cloud economics</li>
              <li>Optimise your costs</li>
            </ul>
          </div>
          <div className="footer-content-desktop-list">
            <h3>Solutions and support</h3>
            <ul>
              <li>Solutions</li>
              <li>Resources for accelerating growth</li>
              <li>Solution architectures</li>
              <li>Support</li>
              <li>Azure demo and live Q&A</li>
            </ul>
          </div>
          <div className="footer-content-desktop-list">
            <h3>Partners</h3>
            <ul>
              <li>Azure Marketplace</li>
              <li>Find a partner</li>
              <li>Technology partners</li>
            </ul>
          </div>
          <div className="footer-content-desktop-list">
            <h3>Resources</h3>
            <ul>
              <li>Training and certifications</li>
              <li>Documentation</li>
              <li>Updates</li>
              <li>Blog</li>
              <li>Developer resources</li>
              <li>Students</li>
              <li>Events and webinars</li>
              <li>Analyst reports, white papers and e-books</li>
              <li>Videos</li>
            </ul>
          </div>
          <div className="footer-content-desktop-list">
            <h3>Cloud computing</h3>
            <ul>
              <li>What is machine learning?</li>
              <li>What is the cloud?</li>
              <li>What is Big Data Analytics?</li>
              <li>What is PaaS?</li>
              <li>What is a container?</li>
              <li>What is DevOps?</li>
            </ul>
          </div>
        </div>
        <div className="footer-bottom-list">
          <div className="change-language-container">
            <p>Change language</p>
            <select className="drop-down">
              <option>English</option>
              <option>Čeština</option>
              <option>Dansk</option>
              <option>Deutsch</option>
              <option>English (Australia)</option>
              <option>English (Canada)</option>
              <option>English (India)</option>
              <option>English (UK)</option>
              <option>Español</option>
            </select>
          </div>
          <div className="azure-footer-links">
            <ul>
              <li>Diversity and Inclusion</li>
              <li>Accessibility</li>
              <li>Privacy & Cookies</li>
              <li>Data Protection Notice</li>
              <li>Trademarks</li>
              <li>Terms of use</li>
              <li>Privacy Data Management</li>
              <li>Contact us</li>
              <li>Feedback</li>
              <li>Sitemap</li>
              <li>© Microsoft 2023</li>
            </ul>
          </div>
        </div>
      </div>
    </>
  )
}

export default Footer
