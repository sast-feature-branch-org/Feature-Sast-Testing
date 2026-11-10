import { createHash } from "node:crypto";
export function WeakHashView({ value }) {
  const digest = createHash("md5").update(value).digest("hex");
  return <span>{digest}</span>;
}