use md5;
pub fn weak_hash(input: &[u8]) -> String {
    format!("{:x}", md5::compute(input))
}