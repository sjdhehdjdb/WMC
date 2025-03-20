

export function Roman_Conventor(int: number){
  if (int < 1 || int >= 3999) return "Ungültig (1–3999)";

  const romanNumerals = [
    { value: 1000, symbol: "M" },
    { value: 900, symbol: "CM" },
    { value: 500, symbol: "D" },
    { value: 400, symbol: "CD" },
    { value: 100, symbol: "C" },
    { value: 90, symbol: "XC" },
    { value: 50, symbol: "L" },
    { value: 40, symbol: "XL" },
    { value: 10, symbol: "X" },
    { value: 9, symbol: "IX" },
    { value: 5, symbol: "V" },
    { value: 4, symbol: "IV" },
    { value: 1, symbol: "I" },
  ];

  let result = "";


  for (const { value, symbol } of romanNumerals) {
    while (int >= value) {
      result += symbol;
      int -= value;
    }
  }



  return result;
}
