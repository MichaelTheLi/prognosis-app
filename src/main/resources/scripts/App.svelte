<script>
  import Header from "./Header.svelte";
  import PageContainer from "./PageContainer.svelte";
  export let url = "";
  export let state = null;
</script>

<section class="page">
  <Header {url} />
  <PageContainer {url} {state} />
</section>

<style>
  .page {
    font-family: sans-serif;
    font-size: 16px;
  }
</style>