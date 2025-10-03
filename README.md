Handle Alias Uniqueness:
Check if the user-supplied alias is already used in the database and throw a clear error or ask for a different alias.
Collision Handling:
If hash-generated keys collide, regenerate or append random characters until uniqueness is guaranteed.
Error Handling for Resolver:
Return user-friendly error messages or redirects if the short URL does not exist or is malformed.
Thread Safety:
Make storage and key generation thread-safe if running in a multi-threaded environment.
Expiry and Analytics (optional):
Add expiry times for short URLs and basic visit analytics if needed.
