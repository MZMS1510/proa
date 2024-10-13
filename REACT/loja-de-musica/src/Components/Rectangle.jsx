const Rectangle = ({ title, text, color }) => {
    const colorVariants = {
        pink: "bg-pink-300",
        brown: "bg-yellow-700"
    }

    return (
        <div className={`text-white ${colorVariants[color] || ""} py-2 px-3 w-[45%]`}>
            <h2 className="font-bold text-2xl my-2">{title}</h2>
            <p className="text-lg">{text}</p>
        </div>
    );
}

export default Rectangle