// Importação de imagens
import countryFlag from "../assets/images/escociaBandeira.png";

// Importação de componentes
import ComponentProps from "./ComponentProps";

// Importação de estilos
import styles from "./Escocia.module.css";

const Escocia = () => {
  const texto =
    "Castelos medievais, lindas florestas, boa cerveja, clima agradável, comida gostosa, ambiente acolhedor e etc.";
  const nome = "Escócia";

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

export default Escocia;
