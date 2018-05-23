<!DOCTYPE html>
<html>
    <head>
        <title>Corpus - Signin</title>
        <link rel="stylesheet" href="/css/bootstrap-4.1.1.min.css"/>
        <link rel="stylesheet" href="/css/index.css"/>
    </head>
    <body class="text-center">
        <form class="form-signin" action="/signin" method="POST">
            <h1 class="h3 mb-3 font-weight-normal">Corpus</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus/>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required/>
            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"/>
                    Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <p class="mt-5 mb-3 text-muted">LandZERO &copy; 2018</p>
        </form>
        <script src="/js/jquery-3.3.1.min.js"></script>
        <script src="/js/bootstrap-4.1.1.min.js"></script>
    </body>
</html>