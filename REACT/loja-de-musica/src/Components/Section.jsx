const Section = ({ children, color }) => {
    const colorVariants = {
        red: "bg-red-600",
        white: "bg-white",
        wine: "bg-red-950"
    }

    return (
        <section className={`flex justify-around ${colorVariants[color]} h-[300px] px-0 py-4`}>
            {children}
        </section>
    )
}

export default Section