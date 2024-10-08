// Importação de imagens
import countryFlag from "../assets/images/chinaBandeira.jfif";

// Importação de componentes
import ComponentProps from "./ComponentProps";

// Importação de estilos
import styles from "./MuralhaDaChina.module.css";

const MuralhaDaChina = () => {
  const nome = "Muralha da China";
  const texto = "Bem vindo a Muralha da China, aqui você andará bastante";

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

export default MuralhaDaChina;
