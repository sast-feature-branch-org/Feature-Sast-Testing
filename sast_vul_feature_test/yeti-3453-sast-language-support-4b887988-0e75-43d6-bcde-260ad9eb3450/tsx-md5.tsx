import { createHash } from "node:crypto";
type Props = { value: string };
export function WeakHashView({ value }: Props) {
  const digest = createHash("md5").update(value).digest("hex");
  return <span>{digest}</span>;
}