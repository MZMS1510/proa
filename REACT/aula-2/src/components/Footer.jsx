// Import images
import insta from "../assets/images/insta.jpg";
import face from "../assets/images/face.jpg";
import tiktok from "../assets/images/tiktok.png";
import whats from "../assets/images/whtas.png";

import styles from "./Footer.module.css";

const Footer = () => {
  return (
    <footer className={styles.footerContainer}>
      <p className={styles.footerText}>Siga-nos em nossas redes sociais</p>
      <ul className={styles.linkList}>
        <li>
          <img src={insta} alt="Instagram" className={styles.linkIcons} />
        </li>
        <li>
          <img src={face} alt="Facebook" className={styles.linkIcons} />
        </li>
        <li>
          <img src={tiktok} alt="TikTok" className={styles.linkIcons} />
        </li>
        <li>
          <img src={whats} alt="Whatsapp" className={styles.linkIcons} />
        </li>
      </ul>
      <p className={styles.footerText}>Telefone de Contato - (11) 4002-8922</p>
    </footer>
  );
};

export default Footer;
