// Importação de imagens
import countryFlag from "../assets/images/usaBandeira.jfif";

// Importação de componentes
import ComponentProps from "./ComponentProps";

// Importação de estilos
import styles from "./GrandCanyon.module.css";

const GrandCanyon = () => {
  const nome = "Grand Canyon";
  const texto = "Bem vindo ao Grand Canyon! Cuidado para não cair";

  return (
    <main className={styles.mainContent}>
      <ComponentProps
        countryName={nome}
        text={texto}
        countryFlag={countryFlag}
      />
    </main>
  );
};

export default GrandCanyon;
