<?php
function weak_hash(string $input): string {
    return md5($input);
}