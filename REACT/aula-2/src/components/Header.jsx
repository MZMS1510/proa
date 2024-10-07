import logo from "../assets/images/viagens.jpg";
import lupa from "../assets/images/lupa.png";
import styles from "./Header.module.css";

const Header = () => {
  return (
    <nav className={styles.navBar}>
      <a href="#">
        <img src={logo} width={90} alt="viagens logo" />
      </a>

      <ul className={styles.linkList}>
        <li>
          <a href="#" className={styles.link}>
            Home
          </a>
        </li>
        <li>
          <a href="#" className={styles.link}>
            Escócia
          </a>
        </li>
        <li>
          <a href="#" className={styles.link}>
            Grand Canyon
          </a>
        </li>
        <li>
          <a href="#" className={styles.link}>
            Muralhas da China
          </a>
        </li>
        <li>
          <a href="#" className={styles.link}>
            Aruba
          </a>
        </li>
      </ul>

      <div className={styles.searchArea}>
        <input type="search" size={20} />
        <img src={lupa} width={30} alt="lupa" />
      </div>
    </nav>
  );
};

export default Header;
