import { createHash } from "node:crypto";
export function weakHash(input) {
  return createHash("md5").update(input).digest("hex");
}