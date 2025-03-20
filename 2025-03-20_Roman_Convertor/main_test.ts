import { Roman_Conventor } from "./main.ts";
import { assertEquals } from "https://deno.land/std/testing/asserts.ts";

Deno.test("convertToRoman: 0 → Ungültig", () => {
  assertEquals(Roman_Conventor(0), "Ungültig (1–3999)");
});

Deno.test("convertToRoman: 4000 → Ungültig", () => {
  assertEquals(Roman_Conventor(4000), "Ungültig (1–3999)");
});

Deno.test("convertToRoman: 1 → I", () => {
  assertEquals(Roman_Conventor(1), "I");
});

Deno.test("convertToRoman: 1000 → I", () => {
  assertEquals(Roman_Conventor(1000), "M");
});
