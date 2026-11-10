import hashlib
def weak_hash(input_value: bytes) -> str:
    return hashlib.md5(input_value).hexdigest()