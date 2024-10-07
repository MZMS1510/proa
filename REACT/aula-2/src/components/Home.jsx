// Importação de imagens
import mala from "../assets/images/mala.jpg";

import styles from "./Home.module.css";

const Home = () => {
  return (
    <main className={styles.mainContent}>
      <img src={mala} alt="mala" className={styles.mainImage} />

      <div className={styles.mainTextArea}>
        <h1 className={styles.mainTitle}>
          Encontre aqui a viagem dos seus sonhos
        </h1>
        <p className={styles.mainText}>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quae
          aperiam, ipsam, ullam quos voluptate quaerat ut ipsa necessitatibus
          inventore eius sapiente culpa nostrum quo enim, dolor ratione possimus
          ipsum odio!
        </p>
      </div>
    </main>
  );
};

export default Home;
