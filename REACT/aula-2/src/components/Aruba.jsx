// Importação de imagens
import countryFlag from "../assets/images/arubaBandeira.jfif";

// Importação de componentes
import ComponentProps from "./ComponentProps";

// Importação de estilos
import styles from "./Aruba.module.css";

const Aruba = () => {
  const nome = "Aruba";
  const texto = "Bem vindo a Aruba! Aproveite nossas praias";

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

export default Aruba;
