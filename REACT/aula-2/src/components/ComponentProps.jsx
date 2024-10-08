import styles from "./ComponentProps.module.css";

const ComponentProps = ({ countryName, text, countryFlag }) => {
  return (
    <div className={styles.container}>
      <h2 className={styles.title}>
        Venha conhecer esse lugar incrível: {countryName}!!!
      </h2>
      <p>{text}</p>
      <img
        src={countryFlag}
        alt={`bandeira de ${countryName}`}
        className={styles.image}
      />
    </div>
  );
};

export default ComponentProps;
